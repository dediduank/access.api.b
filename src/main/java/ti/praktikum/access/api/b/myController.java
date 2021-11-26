/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.praktikum.access.api.b;


import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Dedi Wardani
 */
@Controller
public class myController {
    @CrossOrigin
    @RequestMapping(value="/view/name", produces = {
        MediaType.APPLICATION_JSON_VALUE
    })
    @ResponseBody
    public String showNama(){
        return "Saya Siapa ?";
    }
    
    student mhs = new student();
    @CrossOrigin
    @RequestMapping(value="/view/listname", produces = {
        MediaType.APPLICATION_JSON_VALUE
    })
    @ResponseBody
    public ArrayList<String> showNamaAll(){        
        return mhs.setData();
    }
    
}
