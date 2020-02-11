
cons one = function() {// n003_non_blocking.js
     console.log('one')
}
cons two = () => {
    console.log('two')
}
cons three = () => {
    console.log('three')
}
function four() {
    console.log('four')
}
five = function(){
    console.log('five')
}
cons zero = () => {
    console.log('zero')
    one()
    setTimeout(two,2000)
    three()
}
zero()