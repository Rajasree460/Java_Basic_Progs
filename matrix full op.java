/*matrix full op*/
import java.util.*;
public class matrix_full_op
{
 public static void main(String args[])
 {
 System.out.println("enter the no. of rows of 1st matrix");
 Scanner sc=new Scanner(System.in);
 int row1=sc.nextInt();
 System.out.println("enter the no. of cols of 1st matrix");
 int col1=sc.nextInt();
 System.out.println("enter the no. of rows of 2nd matrix");
 int row2=sc.nextInt();
 System.out.println("enter the no. of cols of 2nd matrix");
 int col2=sc.nextInt();
 int a[][]=new int[5][5];
 int b[][]=new int[5][5];
 int sum[][]=new int[5][5];
 int sub[][]=new int[5][5];
 int res[][]=new int[5][5];
 int trans_mat[][]=new int[5][5];
 int ch=0;
 while(ch!=4)
 {
 System.out.println("MAIN MENU");
 System.out.println("1.addition");
 System.out.println("2.subtraction");
 System.out.println("3.multiplication");
 System.out.println("4.transpose");
 System.out.println("enter your choice");
 ch=sc.nextInt();
 switch(ch)
 {
 case 1:add(a,b,sum,row1,col1,row2,col2);
 break;
 case 2:subtract(a,b,sub,row1,col1,row2,col2);
 break;
 case 3:multiplay(a,b,res,row1,col1,row2,col2);
 break;
 case 4:transpose(a,trans_mat,row1,col1);
 break;
 default:
 System.out.println("invalid ch");
 }
 }
 }
 public static void add(int a[][],int b[][],int sum[][],int row1,int col1,int row2,int col2)
 {
 int i,j,row_sum,col_sum;
 Scanner sc=new Scanner(System.in);
 if(row1==row2 && col1==col2)
 {
 row_sum=row1;
 col_sum=col1;
 System.out.println("enter the values of 1st matrix");
 for(i=0;i<row1;i++)
 {
 for(j=0;j<col1;j++)
 {
 a[i][j]=sc.nextInt();
 }
 }
 System.out.println("enter the values of 2nd matrix");
 for(i=0;i<row2;i++)
 {
 for(j=0;j<col2;j++)
 {
 b[i][j]=sc.nextInt();
 }
 }
 for(i=0;i<row_sum;i++)
 {
 for(j=0;j<col_sum;j++)
 {
 sum[i][j]=a[i][j]+b[i][j];
 }
 }
 System.out.println("after addition the result is");
 for(i=0;i<row_sum;i++)
 {
 System.out.println();
 for(j=0;j<col_sum;j++)
 System.out.print(sum[i][j]+" ");
 }
 System.out.println();
 }
 while(row1!=row2||col1!=col2)
 {
 System.out.println("add not possible");
 }
 }
 public static void subtract(int a[][],int b[][],int sub[][],int row1,int col1,int row2,int col2)
 {
 int i,j,row_sub,col_sub;
 Scanner sc=new Scanner(System.in);
 if(row1==row2 && col1==col2)
 {
 row_sub=row1;
 col_sub=col1;
 System.out.println("enter the values of 1st matrix");
 for(i=0;i<row1;i++)
 {
 for(j=0;j<col1;j++)
 {
 a[i][j]=sc.nextInt();
 }
 }
 System.out.println("enter the values of 2nd matrix");
 for(i=0;i<row2;i++)
 {
 for(j=0;j<col2;j++)
 {
 b[i][j]=sc.nextInt();
 }
 }
 for(i=0;i<row_sub;i++)
 {
 for(j=0;j<col_sub;j++)
 {
 sub[i][j]=a[i][j]-b[i][j];
 }
 }
 System.out.println("after subtraction the result is");
 for(i=0;i<row_sub;i++)
 {
 System.out.println();
 for(j=0;j<col_sub;j++)
 System.out.print(sub[i][j]+" ");
 }
 System.out.println();
 }
 while(row1!=row2||col1!=col2)
 {
 System.out.println("subtract not possible");
 }
 }
 public static void multiplay(int a[][],int b[][],int res[][],int row1,int col1,int row2,int col2)
 {
 int i,j,k,res_row,res_col;
 Scanner sc=new Scanner(System.in);
 if(col1==row2)
 {
 res_row=row1;
 res_col=col2;
 System.out.println("enter the values of 1st matrix");
 for(i=0;i<row1;i++)
 {
 for(j=0;j<col1;j++)
 {
 a[i][j]=sc.nextInt();
 }
 }
 System.out.println("enter the values of 2nd matrix");
 for(i=0;i<row2;i++)
 {
 for(j=0;j<col2;j++)
 {
 b[i][j]=sc.nextInt();
 }
 }
 for(i=0;i<res_row;i++)
 {
 for(j=0;j<res_col;j++)
 {
 res[i][j]=0;
 for(k=0;k<res_col;k++)
 {
 res[i][j]=res[i][j]+(a[i][k]*b[k][j]);
 }
 }
 }
 System.out.println("after multiplication the result is");
 for(i=0;i<res_row;i++)
 {
 System.out.println();
 for(j=0;j<res_col;j++)
 System.out.print(res[i][j]+" ");
 }
 System.out.println();
 }
 while(col1!=row2)
 {
 System.out.println("multiplay not possible");
 }
 }
 public static void transpose(int a[][],int trans_mat[][],int row1,int col1)
 {
 int i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the values of 1st matrix");
 for(i=0;i<row1;i++)
 {
 for(j=0;j<col1;j++)
 {
 a[i][j]=sc.nextInt();
 }
 }
 for(i=0;i<row1;i++)
 {
 for(j=0;j<col1;j++)
 {
 trans_mat[j][i]=a[i][j];
 }
 }
 System.out.println("after transpose the matrix is");
 for(i=0;i<row1;i++)
 {
 System.out.println();
 for(j=0;j<col1;j++)
 System.out.print(trans_mat[i][j]+" ");
 }
 System.out.println();
 }
}
