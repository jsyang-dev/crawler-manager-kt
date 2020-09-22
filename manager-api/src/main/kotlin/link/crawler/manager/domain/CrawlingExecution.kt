package link.crawler.manager.domain

import javax.persistence.*

@Entity
class CrawlingExecution(
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "crawling_master_id")
        var crawlingMaster: CrawlingMaster,

        @Column(nullable = false)
        var siteUrl: String,

        @Column(nullable = false, columnDefinition = "text")
        var executionCode: String
) : BaseEntity() {

    fun changeCrawlingMaster(crawlingMaster: CrawlingMaster) {
        this.crawlingMaster = crawlingMaster
        crawlingMaster.crawlingExecutionList.add(this)
    }
}
