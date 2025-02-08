package com.example

import id.my.hendisantika.LibraryUtility
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service

/**
 * Created by IntelliJ IDEA.
 * Project : Default (Template) Project
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 09/02/25
 * Time: 06.52
 * To change this template use File | Settings | File Templates.
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
class MultimoduleExampleApplication

@Service
class MyService {

    fun getFoo(): String {
        return LibraryUtility.getFoo()
    }
}

fun main(args: Array<String>) {
    runApplication<MultimoduleExampleApplication>(*args)
}
