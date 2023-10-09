function runProgram(input) {
    input=input.trim().split('\n');
    let board=[];
    let l=0;
    for(let i=0; i<input.length; i++){
        board.push(input[l++].trim().split(' ').map(Number))
    }
    if(solve(board)){
        display(board);
    }else{
        console.log(-1)
    }
}
if (process.env.USER === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}

function solve(board){
    let n=board.length;
    let r=-1;
    let c=-1;
    let flag=true;
    for(let i=0; i<n; i++){
        for(let j=0; j<n; j++){
            if(board[i][j]==0){
                r=i,c=j;
                flag=false;
                break;
            }
        }
        if(flag==false){
            break;
        }
    }
    if(flag==true){
        return true;
    }
    for(let n=1; n<=9; n++){
        if(isSafe(board,r,c,n)){
            board[r][c]=n;
            if(solve(board)){
                return true;
            }else{
                board[r][c]=0;
            }
        }
    }
    return false;
}

function isSafe(board,r,c,n){
    let N=board.length;
    for(let i=0; i<N; i++){
        if(board[r][i]==n){
            return false;
        }
    }
    for(let i=0; i<N; i++){
        if(board[i][c]==n){
            return false;
        }
    }
    let sqrt=3;
    let r1=r-r%sqrt;
    let c1=c-c%sqrt;
    for(let i=r1; i<r1+sqrt; i++){
        for(let j=c1; j<c1+sqrt; j++){
            if(board[i][j]==n){
                return false;
            }
        }
    }
    return true;
}
function display(board){
    let n=board.length;
    for(let i=0; i<n; i++){
        let bag=''
        for(let j=0; j<n; j++){
            bag+=board[i][j]+' '
        }
        console.log(bag)
    }
}
