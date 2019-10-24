/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var rst = [];
    nums.forEach(function(val, index) {
        var i = index;
        while(i + 1 < nums.length) {
            if((val + nums[++i]) == target)  {
                rst.push(i);
                rst.push(index);
            }
        }
    });
    return rst;
};