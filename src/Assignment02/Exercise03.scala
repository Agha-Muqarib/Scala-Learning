package Assignment02

object Exercise03 {

  def functParameter(Hafiz: Option[Boolean]) = {
    Hafiz match{
      case Some(true) => println("Admission Granted")
      case Some(false) => println("Admission Denied")
      case None => println("Nada")
    }
  }


  def main(args: Array[String]): Unit = {

    println(functParameter(Some(false)))

  }

}