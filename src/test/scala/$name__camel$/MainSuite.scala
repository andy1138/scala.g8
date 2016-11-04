package $name;format="camel"$

import org.scalatest.FunSuite

class MainSuite extends FunSuite {

  test("whats in a name") {
  	assert( Main.name === "Hello, World")
  }
}