
interface IPlayer {
  fn: string;
  ln: string;
  num: string;
}

export const createPlayer = (fn:string, ln:string, num:number) => {

  const getFullName = () => {
   return `${fn} ${ln}`;
  }
  
  return {
    fn,
    ln,
    num,
    getFullName
  };

}


export const add = (n1: number, n2: number): number => {
  return n1 + n2
}

