package link.crawler.manager.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
open class CrawlingMaster(
        @Column(nullable = false)
        var subject: String
) : BaseEntity() {

        @OneToMany(mappedBy = "crawlingMaster")
        var crawlingExecutionList: MutableList<CrawlingExecution> = mutableListOf()

        @OneToMany(mappedBy = "crawlingMaster")
        var crawlingScheduleList: MutableList<CrawlingSchedule> = mutableListOf()

        @OneToMany(mappedBy = "crawlingMaster")
        var resultMasterList: MutableList<ResultMaster> = mutableListOf()
}