object Demo {
  def main(args: Array[String]): Unit = {

    val personOne = new Person("test", 22)
    val personTwo = new Person("testUser", 22)

    personOne.check(personTwo)


  }

}
