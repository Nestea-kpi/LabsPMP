package Organization

fun main(){
    val dev1 = Developer("Alice", "Smith", 3000.0, 3)
    val dev2 = Developer("Bob", "Johnson", 3000.0, 6)
    val designer = Designer("Charlie", "Brown", 2500.0, 4, 0.9)

    val manager = Manager("Eve", "Davis", 4000.0, 7)
    manager.addTeamMember(dev1)
    manager.addTeamMember(dev2)
    manager.addTeamMember(designer)

    val department = Department(mutableListOf(manager))
   department.giveSalary()


}