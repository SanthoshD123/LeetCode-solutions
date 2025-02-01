class Solution:
    def canFinish(self, numCourses: int, prerequisites: list[list[int]]) -> bool:

        graph = defaultdict(list)
        for course, pre in prerequisites:
            graph[pre].append(course)  

        status = [0] * numCourses

        def dfs(course):
            if status[course] == 1:
                return False
            if status[course] == 2:
                return True
            status[course] = 1

            for next_course in graph[course]:
                if not dfs(next_course):
                    return False
            status[course] = 2
            return True

        for course in range(numCourses):
            if not dfs(course):
                return False 

        return True  
