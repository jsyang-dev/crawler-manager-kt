package link.crawler.manager.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

abstract class BaseEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,

        @Column(updatable = false)
        var createdBy: String,

        @CreatedDate
        @Column(updatable = false)
        var createdDate: LocalDateTime,

        @LastModifiedDate
        var lastModifiedBy: String,

        var lastModifiedDate: LocalDateTime
) {
    constructor()
}