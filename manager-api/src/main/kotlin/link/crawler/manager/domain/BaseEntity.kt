package link.crawler.manager.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
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