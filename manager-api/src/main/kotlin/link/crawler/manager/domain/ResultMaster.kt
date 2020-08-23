package link.crawler.manager.domain

import javax.persistence.*

@Entity
open class ResultMaster(
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "crawling_master_id")
        var crawlingMaster: CrawlingMaster,

        @Column(nullable = false)
        var resultCount: Int,

        @Column(nullable = false)
        var successYn: Boolean,

        @Column(nullable = false)
        var sendYn: Boolean

) : BaseEntity() {

    @OneToMany(mappedBy = "resultMaster")
    var resultDetailList: MutableList<ResultDetail> = mutableListOf()

    fun changeCrawlingMaster(crawlingMaster: CrawlingMaster) {
        this.crawlingMaster = crawlingMaster
        crawlingMaster.resultMasterList.add(this)
    }
}
