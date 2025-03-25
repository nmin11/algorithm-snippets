"""
2차원 배열 회전 함수 스니펫

- rotate_90_cw(matrix): 시계 방향으로 90도 회전
- rotate_90_ccw(matrix): 반시계 방향으로 90도 회전
- rotate_180(matrix): 180도 회전
"""

def rotate_90_cw(matrix):
    """
    시계 방향으로 90도 회전
    예: [[1,2,3],       [[7,4,1],
        [4,5,6],  →     [8,5,2],
        [7,8,9]]        [9,6,3]]
    """
    n = len(matrix)
    m = len(matrix[0])
    result = [[0] * n for _ in range(m)]
    for i in range(n):
        for j in range(m):
            result[j][n - i - 1] = matrix[i][j]
    return result

def rotate_90_ccw(matrix):
    """
    반시계 방향으로 90도 회전
    예: [[1,2,3],       [[3,6,9],
		[4,5,6],  →     [2,5,8],
        [7,8,9]]        [1,4,7]]
    """
    n = len(matrix)
    m = len(matrix[0])
    result = [[0] * n for _ in range(m)]
    for i in range(n):
        for j in range(m):
            result[m - j - 1][i] = matrix[i][j]
    return result

def rotate_180(matrix):
    """
    180도 회전
    예: [[1,2,3],       [[9,8,7],
        [4,5,6],  →     [6,5,4],
        [7,8,9]]        [3,2,1]]
    """
    n = len(matrix)
    m = len(matrix[0])
    result = [[0] * m for _ in range(n)]
    for i in range(n):
        for j in range(m):
            result[n - i - 1][m - j - 1] = matrix[i][j]
    return result

# 테스트
if __name__ == "__main__":
    sample = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

    print("원본:")
    for row in sample:
        print(row)

    print("\n90도 시계 방향 회전:")
    for row in rotate_90_cw(sample):
        print(row)

    print("\n90도 반시계 방향 회전:")
    for row in rotate_90_ccw(sample):
        print(row)

    print("\n180도 회전:")
    for row in rotate_180(sample):
        print(row)
