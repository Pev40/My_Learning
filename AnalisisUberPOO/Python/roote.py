class Route:
    id = int
    star = []
    end = []
    
    def __init__(self,star,end) -> None:
        self.star = star
        self.end = end