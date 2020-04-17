# Quiz-App-Spring-Boot-Backend-Application-
Here you may find API that is compatible to give you the all the quiz available in the BACK-END(DB)->with its questions

You may POST this JSON data through postman
:localhost:8000/api/quiz



{
	"name": "Angular",
	"questions": [
    	{
        "text": "question text",
        "choices": [
            {
                "text": "Exception",
                "isAnswer": true
            },
            {
                "text": "Code-behind",
                "isAnswer": false
            },
            {
                "text": null,
                "isAnswer": false
            },
            {
                "text": "None of the above",
                "isAnswer": true
            }
        ]
    }
]
}





You may GET this JSON data through postman or your browser
localhost:8000/api/quiz
*All the quizes with all the joins will appear*


