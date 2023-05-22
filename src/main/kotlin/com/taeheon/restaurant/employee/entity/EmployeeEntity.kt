package com.taeheon.restaurant.employee.entity;

import com.taeheon.restaurant.enums.EmployeeType
import com.taeheon.restaurant.store.entity.StoreEntity
import jakarta.persistence.*
import java.time.LocalDate

@Entity(name = "t_employee")
class EmployeeEntity(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    var store: StoreEntity,
    var employeeName: String,
    var contact: String,
    var address: String,
    var age: Int,
    var joinDate: LocalDate,
    @Enumerated(EnumType.STRING)
    var employeeType: EmployeeType,
    var employeePic: String,
) {
    @Id
    @GeneratedValue
    var id: Long? = null
}
