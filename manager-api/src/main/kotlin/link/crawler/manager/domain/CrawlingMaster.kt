package link.crawler.manager.domain

import javax.persistence.Column
import javax.persistence.OneToMany

open class CrawlingMaster(

        @Column(nullable = false)
        var subject: String,

        @OneToMany(mappedBy = "crawlingMaster")
        var crawlingExecutionList: List<CrawlingExecution> = ArrayList(),

        @OneToMany(mappedBy = "crawlingMaster")
        var crawlingScheduleList: List<CrawlingSchedule> = ArrayList(),

        @OneToMany(mappedBy = "crawlingMaster")
        var resultMasterList: List<ResultMaster> = ArrayList()
) : BaseEntity()