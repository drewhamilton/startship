package nevam

data class Pom(val coordinates: MavenCoordinates) {
  val groupId: String get() = coordinates.groupId
  val artifactId: String get() = coordinates.artifactId
  val version: String get() = coordinates.version

  /** e.g., app/cash/paparazzi/paparazzi/0.0.1 */
  fun mavenDirectory(includeVersion: Boolean): String {
    return coordinates.mavenDirectory(includeVersion)
  }
}
