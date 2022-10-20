//Michael Rollins darthsharkmike@gmail.com

//for CTE software development 1

//instructor Mr Gross
 
 
class countingArrays {
    public static void main(String[] args) {
        int i=0;
        int f=1;
        int sum=0;
        int array[]=new int[100];  
        for(f=1;f<=100;f++) {
            array[f-1] = f;
            sum=sum+f; //Adding numbers and setting up array.
        }
        for(i=0;i<=-1+array.length;i++) { //In regards to '-1+array.length' ==>
//      Just using 'array/length' here would always throw an out-of-bounds exception
            int oddeven = array[i];
            System.out.println(array[i]);  
            if(oddeven%2==1) {  //determining even or odd
                System.out.println("Odd");
            }
            else {
                System.out.println("Even");
            }
            System.out.println();
        }
        System.out.print("total "+sum);
    }
}
Output:

1
Odd

2
Even

3
Odd

4
Even

5
Odd

6
Even

7
Odd

8
Even

9
Odd

10
Even

11
Odd

12
Even

13
Odd

14
Even

15
Odd

16
Even

17
Odd

18
Even

19
Odd

20
Even

21
Odd

22
Even

23
Odd

24
Even

25
Odd

26
Even

27
Odd

28
Even

29
Odd

30
Even

31
Odd

32
Even

33
Odd

34
Even

35
Odd

36
Even

37
Odd

38
Even

39
Odd

40
Even

41
Odd

42
Even

43
Odd

44
Even

45
Odd

46
Even

47
Odd

48
Even

49
Odd

50
Even

51
Odd

52
Even

53
Odd

54
Even

55
Odd

56
Even

57
Odd

58
Even

59
Odd

60
Even

61
Odd

62
Even

63
Odd

64
Even

65
Odd

66
Even

67
Odd

68
Even

69
Odd

70
Even

71
Odd

72
Even

73
Odd

74
Even

75
Odd

76
Even

77
Odd

78
Even

79
Odd

80
Even

81
Odd

82
Even

83
Odd

84
Even

85
Odd

86
Even

87
Odd

88
Even

89
Odd

90
Even

91
Odd

92
Even

93
Odd

94
Even

95
Odd

96
Even

97
Odd

98
Even

99
Odd

100
Even

total 5050
