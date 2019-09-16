export class UserMentorModel {
  constructor(private userId:number,
              private mentorId:number,
              private  skillId:number,
              private userProposal:boolean,
              private mentorProposal:boolean,
              private userReconfirmProposal:boolean,
              private  userRating:boolean,
              private userProgress:number,
              private feedback:string){}
}
