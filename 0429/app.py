from datetime import datetime

from flask import Flask, render_template, jsonify, request
from pymongo import MongoClient

app = Flask(__name__)

client = MongoClient("mongodb://localhost:27017/")
db = client.test


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/detail/<idx>')
def detail(idx):
    return '완료'

    @app.route('/post', methods=['POST'])
    def save_post():
        title_receive = request.form['title_give']
        pw_receive = request.form['pw_give']
        content_receive = request.form['content_give']
        doc = {
            'title': title_receive,
            'content': content_receive,
            'pw': pw_receive
        }
        db.articles.insert_one(doc)

        return jsonify({'result': 'success', 'msg': '포스팅 성공!'})

    @app.route('/post', methods=['GET'])
    def get_post():
        articles = list(db.articles.find({}, {'_id': False}))
        return jsonify({'result': 'success', 'articles': articles})

    @app.route('/post', methods=['DELETE'])
    def delete_post():
        idx = request.args.get('idx')
        db.test.delete_one({'idx': int(idx)})
        return {"result": "success"}

    if __name__ == "__main__":
        app.run(host="0.0.0.0", port=5000)
