package com.taeheon.restaurant.store.entity

import com.taeheon.restaurant.common.entity.BaseEntity
import com.taeheon.restaurant.employee.entity.EmployeeEntity
import com.taeheon.restaurant.enums.EmployeeType
import jakarta.persistence.*

@Entity(name = "t_store")
class StoreEntity(
    employeeNo: Long,
    var storeName: String,
    var address: String,
    var tableCount: Int,
    openTime: String? = "00:00",
    closeTime: String? = "23:59"
) : BaseEntity(employeeNo, employeeNo) {
    @Id
    @Column(name = "store_id")
    @GeneratedValue
    var id: Long? = null
    var openTime: String? = openTime
        set(value) {
            val regex = "([01]\\d|2[0-3]):([0-5]\\d)".toRegex()
            if (value != null && regex.matchEntire(value) != null) {
                field = value;
            } else {
                throw IllegalArgumentException("store open time format error")
            }
        }
    var closeTime: String? = closeTime
        set(value) {
            val regex = "([01]\\d|2[0-3]):([0-5]\\d)".toRegex()
            if (value != null && regex.matchEntire(value) != null) {
                field = value;
            } else {
                throw IllegalArgumentException("store close time format error")
            }
        }

    @OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
    val employeeList: MutableList<EmployeeEntity> = ArrayList()

    fun addEmployee(employee: EmployeeEntity) {
        employeeList.add(employee)
    }

    fun modifyTableCount(employee: EmployeeEntity, tableCount: Int) {
        when (employee.employeeType) {
            EmployeeType.MANAGEMENT_STAFF, EmployeeType.MANAGER -> {
                this.tableCount += tableCount
            }

            else -> {
                throw RuntimeException("Not accept Exception")
            }
        }
    }

    fun modifyStoreHours(openTime: String?, closeTime: String?) {

        this.openTime = openTime
        this.closeTime = closeTime
    }
}