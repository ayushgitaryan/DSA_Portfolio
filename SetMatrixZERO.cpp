class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int n=matrix.size();  // for rows
        int m=matrix[0].size(); //for columns

        vector<int>row(n),col(m);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){             //first pass mark zero
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] || col[j]){       //2nd pass update the matrix
                    matrix[i][j]=0;
                }

            }
        }


    }
};
