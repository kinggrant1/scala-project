@main def leetspeak: Unit =
  val lowerMap = Map(
    't' -> '7',
    'i' -> '1',
    's' -> '5',
    'e' -> '3',
    'a' -> '4',
    'o' -> '0'
  )

  val upperMap = lowerMap.map {
    case (k, v) => k.toUpper -> v
  }

  val allMap = (lowerMap ++ upperMap).withDefault(k => k)

  println("Grant King")
  println("Grant King".map(allMap))
  println("Leetspeak with Scala!")
  println("Leetspeak with Scala!".map(allMap))