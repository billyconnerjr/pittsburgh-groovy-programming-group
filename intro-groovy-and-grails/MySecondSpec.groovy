/**
 * Demonstrates improving a spock test to be more expressive
 *
 * author: Billy Conner 
 * twitter: @billyconnerjr
 */
@Grapes(
    @Grab(group='org.spockframework', module='spock-core', version='1.0-groovy-2.4')
)

import spock.lang.*

class MySecondSpec extends Specification {
    void 'should remove bananas'(){
        given: 'a list of fruits'
            def fruit = ['apple', 'pear', 'bananas', 'orange']
        
        when: 'removing bananas'
            fruit.remove('bananas')
        
        then: 'we have no bananas'
            fruit.contains('bananas') == false
    }
}