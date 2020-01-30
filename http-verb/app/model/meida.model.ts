export class Media{
    id : number
    file : string;
    description : string;
    tag: string;

    constructor(file:string, description:string, tag:string){
        this.file = file;
        this.description = description;
        this.tag = tag;
    }
}