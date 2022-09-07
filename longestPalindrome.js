

console.log(longestPalindrome("racecarsee"));


function longestPalindrome(String){
    //variables to hold the input and current longest palindrome found
    var inputStr = String;
    var longPal = '';

    for (i = 0; i <inputStr.length+1; i++){
        for (j=i; j<inputStr.length+1; j++){
            //tests the section of string between outer index (i) and incrementing inner index (j)
            var testingSection = inputStr.substring(i,j);
            //reversed takes the above string, splits it into an array, reverses and recombines into a string
            var reversed = testingSection.split("").reverse().join("");

            //if the section being tested is identical backwards AND it's longer than the currently longest palindrome found, replace the longest palindrome with the tested section
            if ((testingSection == reversed)&&(testingSection.length > longPal.length)){
                longPal = testingSection;
            }
        }
    }
    return longPal;
}