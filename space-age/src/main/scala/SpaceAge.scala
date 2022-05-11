
object spaceAge{
  val anoenseg = 31557600
  def main (args: Array[String]){

  def onEarth(s: Double, orbitalPeriod: Double = 1): Double = {
    ((s/orbitalPeriod/anoenseg * 100)/100.0)
  }

  def mercury(s: Double): Double = {
    onEarth(s,0.2408467)
  }
  def venus(s: Double): Double = {
    onEarth(s,0.61519726)
  }
  def mars(s: Double): Double = {
    onEarth(s,1.8808158)
  }
  def jupiter(s: Double): Double = {
    onEarth(s,11.862615)
  }
  def saturn(s: Double): Double = {
    onEarth(s,29.447498)
  }
  def uranus(s: Double): Double = {
    onEarth(s,84.016846)
  }
  def neptune(s: Double): Double = {
    onEarth(s,164.79132)}
}
}