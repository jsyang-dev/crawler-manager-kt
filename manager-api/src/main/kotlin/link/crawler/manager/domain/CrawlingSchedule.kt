package link.crawler.manager.domain

import javax.persistence.*

@Entity
open class CrawlingSchedule(
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "crawling_master_id")
        var crawlingMaster: CrawlingMaster,

        @Column(nullable = false)
        var cronExpression: String
) : BaseEntity() {

    fun changeCrawlingMaster(crawlingMaster: CrawlingMaster) {
        this.crawlingMaster = crawlingMaster
        crawlingMaster.crawlingScheduleList.add(this)
    }
}
