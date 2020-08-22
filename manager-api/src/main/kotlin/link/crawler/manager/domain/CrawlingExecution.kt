package link.crawler.manager.domain

import javax.persistence.*

@Entity
open class CrawlingExecution(
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "crawling_master_id")
        var crawlingMaster: CrawlingMaster,

        @Column(nullable = false)
        val siteUrl: String,

        @Column(nullable = false, columnDefinition = "text")
        val executionCode: String
) {
        fun changeCrawlingMaster(crawlingMaster: CrawlingMaster) {
                this.crawlingMaster = crawlingMaster;
                crawlingMaster.getCrawlingExecutionList().add(this);
        }
}
