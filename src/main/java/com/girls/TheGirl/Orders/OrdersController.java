package com.girls.TheGirl.Orders;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.girls.TheGirl.Product.Product;

import com.girls.TheGirl.Orders.Orders;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import static jdk.nashorn.internal.runtime.Debug.id;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A
 */
@RestController
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired //เป็นการเชื่อมclassกัน อย่างauto
    OrdersService OrdersService;

    @GetMapping()
    public List<Orders> getOrders() {
        return OrdersService.retrieveOrders();
    }

    //สร้างรับ post orderจากอาทฟร้อน
    @PostMapping("/addOrder")
    public ResponseEntity<?> postOrder(@Valid @RequestBody Orders body) {
        Orders o = OrdersService.createOrders(body);
        System.out.println(body);

        return ResponseEntity.status(HttpStatus.CREATED).body(o);
    }
    //สร้างรับ post addressจากอาทฟร้อน

    @PostMapping("/Mailing")
    public JSONObject putUpdateAddress(@RequestBody JSONObject body) throws MessagingException, AddressException, IOException {
      
            String email = body.getAsString("email");
            String prodName = body.getAsString("name");
            int qun = (int) body.getAsNumber("qun");
            int total = (int) body.getAsNumber("tal");
            String id = body.getAsString("id");

            sendmail(email, prodName, qun, total,id);
       
         
        return body;
    }

    private void sendmail(String email, String prodName, int qun, int total, String id) throws AddressException, MessagingException, IOException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        System.out.println("" + email + prodName + qun + total +id);
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("mustache.girls48@gmail.com", "namotassa");
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("Mustache.girls", false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
        msg.setSubject("Confirmed orders No. 00"+id);
        msg.setContent("<h1>"+prodName+"</h1>"+"<h3>"+" Amount: " + qun +"</h3>"+"<h3>"+" Total: " + total +"Baht </h3>"+"<h3>"+"Status: shipping"+"</h3>", "text/html");
        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent("Tutorials point email", "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        MimeBodyPart attachPart = new MimeBodyPart();

//        attachPart.attachFile("/var/tmp/image19.png");
//        multipart.addBodyPart(attachPart);
//        msg.setContent(multipart);
        Transport.send(msg);
    }
}
