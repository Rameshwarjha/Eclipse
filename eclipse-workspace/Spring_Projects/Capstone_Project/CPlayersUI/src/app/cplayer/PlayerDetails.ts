//import { DetailsData } from "./DetailsData";

export class PlayerDetails {
    // profile: String;
    // battingStyle: string;
    // bowlingStyle: String;
    // majorTeams: String;
    // currentAge: string;
    // born: String;
    // fullName: String;
    // name: string;
    // country: String;
    // playingRole: String;
    //data: DetailsData;

    pid: string;
    playerImg: String;
    name: string;
    dateOfBirth: String;
    role: String;
    battingStyle: string;
    bowlingStyle: String;
    placeOfBirth: String;
    country: String;

    constructor() {
        this.pid = undefined;
        this.playerImg = undefined;
        this.name = undefined;
        this.dateOfBirth=undefined;
        this.role=undefined;
        this.battingStyle = undefined;
        this.bowlingStyle = undefined;
        this.placeOfBirth=undefined;
        this.country = undefined;
       
        // this.majorTeams = undefined;
        // this.profile = undefined;
        // this.currentAge = undefined;
        // this.born = undefined;
        // this.fullName = undefined;  
        // this.playingRole = undefined;
        //this.data = undefined;
    }
}