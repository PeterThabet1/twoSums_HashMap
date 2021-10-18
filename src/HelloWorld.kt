/*val nums : IntArray = intArrayOf(2,11,15,7)
val target = 9
*/

fun main(args: Array<String>){

    fun twoSum (nums : IntArray, target : Int) : IntArray  {
        var vis = hashMapOf<Int, Int>()
        var res = intArrayOf()
        for(i in nums){
            var sec = target - i
            if(vis.containsKey(sec)){
                res = intArrayOf(nums.indexOf(i), nums.indexOf(sec))
                break
            }
            else{
                vis.put(i, nums.indexOf(i))
            }
        }
        if(res.size<1){
            return intArrayOf(-1,-1)
        }
        else return res
    }





/*
    var lol = twoSum(nums, target)
    lol.forEach { println(it) }
*/
}