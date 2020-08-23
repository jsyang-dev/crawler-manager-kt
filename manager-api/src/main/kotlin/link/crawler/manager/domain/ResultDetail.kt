package link.crawler.manager.domain

import javax.persistence.*

@Entity
open class ResultDetail(
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "result_master_id")
        var resultMaster: ResultMaster,

        @Column(nullable = false)
        var siteUrl: String,

        @Column(nullable = false)
        var title: String,

        @Column(nullable = false, columnDefinition = "text")
        var content: String,

        @Column(nullable = false)
        var link: String
) : BaseEntity() {

}
