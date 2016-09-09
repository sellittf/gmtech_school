# usage:
# $ ruby presenter.rb {excluded_name_1} {excluded_name_2}

presenters = (File.readlines 'presenters.txt').map(&:strip).delete_if(&:empty?)

excluded = ARGV
presenters -= excluded

puts presenters.sample

