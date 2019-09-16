export class SkillModel {
constructor(private skillId:number,
            private mentorId:number,
            private skillName:string,
            private skillDuration:number,
            private videoMaterial:boolean,
            private notesMaterial:boolean,
            private liveVideos:boolean,
            private doubtSession:boolean){}
}
