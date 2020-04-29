/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.testws.testws_2020.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Daniel
 */
@XmlRootElement(name = "person")
@XmlType(propOrder={"id","fullname","age"})
public class Person {

    private int id, age,salario;
    private String fullName;

    

    public Person() {
       id=0;
       fullName=new String("Zero");
       age=24;
       salario=0;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    @XmlElement
    public int getSalario() {
        return (getAge()*980657)/3;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
    
}
