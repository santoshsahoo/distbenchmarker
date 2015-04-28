 
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
 
class AppTests extends FunSuite with BeforeAndAfter {
	test("main should work"){
		AppMain.main(null)
		assert(true)
	}
}
