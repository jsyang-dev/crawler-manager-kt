package link.crawler.manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ManagerApiApplication

fun main(args: Array<String>) {
    runApplication<ManagerApiApplication>(*args)
}
