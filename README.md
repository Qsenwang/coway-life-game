# coway-life-game
Runing instruction

1. Set the metrix scope in State.class first. ![image](https://user-images.githubusercontent.com/55969468/140336807-69e4b9e3-22b6-4af2-aacc-a2dda7502844.png)

2. Set initial active cells in the Game class. ![image](https://user-images.githubusercontent.com/55969468/140337118-af526f18-5464-4b2f-935e-f9ba3434fb84.png)
3. Use arrlist add to add all the Alive cells you want, then creat instance of State, use setInitState to add all the alive cells into the metrix. (AliveCell is design to store multiple pair int values, duplicated available)
4. Change for-loop number to control how many round you want to generate.![image](https://user-images.githubusercontent.com/55969468/140340610-569a38aa-e512-45f7-abff-4a07606390bd.png)

5. State.nextstate() is used to updating the mextrix into next round.
6. State.show is used to print the activecells index-pair postion .
7. run main() in Game 
