package br.edu.ifsp.arq.ads.dmos5.project2

import java.io.Serializable

class Person (private var name: String, private var age: Int): Serializable {

    fun getName(): String{
        return name;
    }

    fun getAge(): Int {
        return age;
    }

    fun setName(name: String){
        this.name = name;
    }

    fun setAge(age: Int){
        this.age = age;
    }

}