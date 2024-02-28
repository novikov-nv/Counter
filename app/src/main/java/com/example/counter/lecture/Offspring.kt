package com.example.counter.lecture

class Offspring : Secondary() , Archer, Singer{
    override fun archery() {
        super.archery()
        println("Archer skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by Offspring")
    }
}