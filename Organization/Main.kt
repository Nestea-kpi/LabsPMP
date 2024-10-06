package Organization

fun main(){
    val dev1 = Developer("Alice", "Smith", 2600.0, 4)
    val dev2 = Developer("Bob", "Johnson", 2400.0, 2)
    val designer = Designer("Charlie", "Brown", 3500.0, 8, 0.8)

    val manager = Manager("Eve", "Davis", 5700.0, 8)
    manager.addTeamMember(dev1)
    manager.addTeamMember(dev2)
    manager.addTeamMember(designer)

    val department = Department(mutableListOf(manager))
   department.giveSalary()


}
