# Last updated: 15/07/2026, 08:46:57
class Solution:
    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
        st=startTime.split(":")
        et=endTime.split(":")
        start=0
        end=0
        res=0
        for i in range(0,3):
            if i==2:
                start+=int(st[i])
                end+=int(et[i])
            elif i==1:
                start+=(60*int(st[i]))
                end+=(60*int(et[i]))
            else:
                start+=(60*60*int(st[i]))
                end+=(60*60*int(et[i]))
        
        return abs(start-end)