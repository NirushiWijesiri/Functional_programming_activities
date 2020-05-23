object VolumeOfSphere extends App{
  def calculateTheVolume(r: Int): Double ={
    (4/3)*(22/7)*r*r*r
  }
  val result = calculateTheVolume(5)
  println("The Volume of The Sphere Is : " + result)

}
