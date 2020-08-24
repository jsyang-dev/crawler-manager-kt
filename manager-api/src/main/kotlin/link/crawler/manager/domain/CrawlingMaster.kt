package link.crawler.manager.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class CrawlingMaster(
        @Column(nullable = false)
        var subject: String
) : BaseEntity() {

        @OneToMany(mappedBy = "crawlingMaster")
        var crawlingExecutionList = mutableListOf<CrawlingExecution>()

        @OneToMany(mappedBy = "crawlingMaster")
        var crawlingScheduleList = mutableListOf<CrawlingSchedule>()

        @OneToMany(mappedBy = "crawlingMaster")
        var resultMasterList = mutableListOf<ResultMaster>()
}