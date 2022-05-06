from datetime import datetime

from flask import Flask, render_template, jsonify, request, redirect
from pymongo import MongoClient

app = Flask(__name__)

client = MongoClient("mongodb://localhost:27017/")
db = client.timeattack

@app.route('/')
def index():
    return render_template('index.html')


@app.route('/detail/<idx>')
def detail(idx): 1


@app.route('/articleList', methods=['GET'])
def get_article_list():
    article_list = []

    for article in article_list:
        article['reg_date'] = article['reg_date'].strftime('%Y.%m.%d %H:%M:%S')
    return jsonify({"article_list": article_list})


# Create
@app.route('/article', methods=['POST'])
def create_article():
    title = request.form['title']
    content = request.form['content']
    pw = request.form['pw']

    doc = {'title': title, 'content': content, 'pw': pw}
    db.article.insert_one(doc)
    return {"result": "success", "msg": "저장완료!"}


# Read
@app.route('/article', methods=['GET'])
def read_article():
    article = list(db.doc.find({}, {'_id': False}))
    return jsonify({"article": article})


# Update
@app.route('/article', methods=['PUT'])
def update_article():
    # todo
    return {"result": "success"}


# Delete
@app.route('/article', methods=['DELETE'])
def delete_article():
    title = request.form['title']
    db.doc.delete_one({"title": title})
    return {"result": "success"}




if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)
