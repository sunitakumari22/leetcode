function twosum(n,t){
    const map =new Map()
    for(let i=0;i<n.length;i++)
    {
        const c=t-n[i];
        if(map.has(c)){
            return [map.get(c),i];
        
        }
        map.set(n[i],i);
    }
    return [];
}
let n=[2,7,8,10,11];
let t=9
console.log("Output:", twosum(n, t));
