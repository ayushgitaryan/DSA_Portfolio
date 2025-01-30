/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    void reorderList(ListNode* head) {
        if(head == NULL || head->next == NULL )return ;

      

      // step 1  Find middle element

      ListNode* slow=head;
      ListNode* fast=head;
      while(fast!=NULL && fast->next!= NULL){
        slow=slow->next;
        fast=fast->next->next;
      }

      //Reverse the second half

      ListNode* prev=NULL;
      ListNode* temp=NULL;
      while(slow!=NULL){
        temp=slow->next;
        slow->next=prev;
        prev=slow;
        slow=temp;
      }

      //Merge both halves here l1 is first half and l2 is second half

      ListNode* l1=head;
      ListNode* l2=prev;
      while(l2->next){
        temp=l1->next;
        prev=l2->next;
        l1->next=l2;
        l2->next=temp;
        l1=temp;
        l2=prev;
      }



    }
};
